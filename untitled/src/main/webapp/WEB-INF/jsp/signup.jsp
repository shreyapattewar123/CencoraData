<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Signup</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            padding: 50px;
        }
        .signup-container {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            background: white;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        input[type="text"],
        input[type="password"],
        input[type="email"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 3px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="signup-container">
    <h2>Signup</h2>
    <form action="signup.jsp" method="post">
        <label for="newUsername">Username:</label>
        <input type="text" id="newUsername" name="newUsername" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="newPassword">Password:</label>
        <input type="password" id="newPassword" name="newPassword" required>

        <input type="submit" value="Signup">
    </form>

    <!-- Display error/success messages, if any -->
    <c:if test="${not empty signupError}">
        <p style="color:red;">${signupError}</p>
    </c:if>
    <c:if test="${not empty signupSuccess}">
        <p style="color:green;">${signupSuccess}</p>
    </c:if>
</div>

</body>
</html>