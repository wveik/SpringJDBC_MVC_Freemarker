<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>User</title>
</head>
<body>
    <h1>User Info</h1>
    <h3><a href="javascript:history.back()">Go Back</a></h3>

    <table border="1px">
        <tr>
            <td>Id</td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${user.age}</td>
        </tr>
    </table>
</body>
</html>