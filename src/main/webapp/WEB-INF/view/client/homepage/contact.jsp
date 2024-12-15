<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Trang chủ - ZShoe</title>

                <!-- Google Web Fonts -->
                <link rel="preconnect" href="https://fonts.googleapis.com">
                <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
                <link
                    href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Raleway:wght@600;800&display=swap"
                    rel="stylesheet">

                <!-- Icon Font Stylesheet -->
                <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css" />
                <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
                    rel="stylesheet">

                <!-- Libraries Stylesheet -->
                <link href="/client/lib/lightbox/css/lightbox.min.css" rel="stylesheet">
                <link href="/client/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">


                <!-- Customized Bootstrap Stylesheet -->
                <link href="/client/css/bootstrap.min.css" rel="stylesheet">

                <!-- Template Stylesheet -->
                <link href="/client/css/style.css" rel="stylesheet">

                <meta name="_csrf" content="${_csrf.token}" />
                <!-- default header name is X-CSRF-TOKEN -->
                <meta name="_csrf_header" content="${_csrf.headerName}" />

                <link href="https://cdnjs.cloudflare.com/ajax/libs/jquery-toast-plugin/1.3.2/jquery.toast.min.css"
                    rel="stylesheet">
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        margin: 0;
                        padding: 0;
                        background-color: #f8f9fa;
                    }

                    header {
                        background-color: #343a40;
                        color: white;
                        padding: 10px 20px;
                        text-align: center;
                    }

                    main {
                        margin: 20px auto;
                        max-width: 600px;
                        background: white;
                        padding: 20px;
                        border-radius: 8px;
                        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                    }

                    h1 {
                        text-align: center;
                        color: #343a40;
                    }

                    label {
                        display: block;
                        margin-top: 10px;
                        font-weight: bold;
                    }

                    input,
                    textarea,
                    button {
                        width: 100%;
                        padding: 10px;
                        margin-top: 5px;
                        border: 1px solid #ced4da;
                        border-radius: 4px;
                    }

                    button {
                        background-color: #343a40;
                        color: white;
                        cursor: pointer;
                        border: none;
                    }

                    button:hover {
                        background-color: #495057;
                    }

                    .success {
                        color: green;
                        margin-top: 10px;
                    }

                    .error {
                        color: red;
                        margin-top: 10px;
                    }
                </style>
            </head>

            <body>
                <jsp:include page="../layout/header.jsp" />
                <main>
                    <h1>Liên hệ với chúng tôi</h1>
                    <form action="contact.jsp" method="post">
                        <label for="name">Họ và tên</label>
                        <input type="text" id="name" name="name" required>

                        <label for="email">Email</label>
                        <input type="email" id="email" name="email" required>

                        <label for="message">Lời nhắn</label>
                        <textarea id="message" name="message" rows="5" required></textarea>

                        <button type="submit">Gửi liên hệ</button>
                    </form>


                    <jsp:include page="../layout/footer.jsp" />
            </body>

            </html>