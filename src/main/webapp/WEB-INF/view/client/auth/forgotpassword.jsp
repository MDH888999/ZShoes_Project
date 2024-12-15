<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
            <!DOCTYPE html>
            <html>

            <head>
                <title>
                    <spring:message code="message.resetPassword" />
                </title>
                <script src="jquery.min.js"></script>
            </head>

            <body>
                <h1>
                    <spring:message code="message.resetPassword" />
                </h1>

                <label for="email">
                    <spring:message code="label.user.email" />
                </label>
                <input id="email" name="email" type="email" value="" />
                <button type="button" onclick="resetPass()">
                    <spring:message code="message.resetPassword" />
                </button>

                <a href="/register">
                    <spring:message code="label.form.loginSignUp" />
                </a>
                <a href="/login">
                    <spring:message code="label.form.loginLink" />
                </a>

                <script>
                    var serverContext = '<c:url value="/" />';
                    function resetPass() {
                        var email = $("#email").val();
                        $.post(serverContext + "user/resetPassword", { email: email },
                            function (data) {
                                window.location.href = serverContext + "login?message=" + data.message;
                            })
                            .fail(function (data) {
                                if (data.responseJSON.error.indexOf("MailError") > -1) {
                                    window.location.href = serverContext + "emailError.html";
                                } else {
                                    window.location.href = serverContext + "login?message=" + data.responseJSON.message;
                                }
                            });
                    }
                </script>
            </body>

            </html>