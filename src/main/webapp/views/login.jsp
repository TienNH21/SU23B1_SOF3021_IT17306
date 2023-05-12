<%@ page language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <form action="/login" method="POST">
        <div>
            <label>Email</label>
            <input type="text" name="email">
        </div>
        <div>
            <label>Password</label>
            <input type="password" name="password">
        </div>
        <div>
            <button>Login</button>
        </div>
    </form>
</body>
</html>
