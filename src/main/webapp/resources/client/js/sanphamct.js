myApp.controller("ctSanPhamController", function ($scope, $routeParams, $http) {
    $http.get("http://localhost:3000/sanPham?id=" + $routeParams.id)
        .then(function (response) {
            $scope.danhSachSanPham = response.data;
        });
})