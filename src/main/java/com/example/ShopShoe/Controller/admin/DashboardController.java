package com.example.ShopShoe.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ShopShoe.Service.OrderService;
import com.example.ShopShoe.Service.UserService;

@Controller
public class DashboardController {

    private final UserService userService;
    private final OrderService orderService;

    public DashboardController(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    @GetMapping("/admin")
    public String getDashboard(Model model) {
        model.addAttribute("countUsers", this.userService.countUsers());
        model.addAttribute("countProducts", this.userService.countProducts());
        model.addAttribute("countOrders", this.userService.countOrders());
        Double totalRevenue = orderService.getTotalRevenue();
        model.addAttribute("totalRevenue", totalRevenue);
        return "admin/dashboard/show";
    }
}
