<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Update User</title>
</head>
<body>

<form name="user" id="main_form" action="#" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${user.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${user.name}">
    <p>Email</p>
    <input title="Email" type="text" name="email" value="${user.email}">
    <p>Age</p>
    <input title="Age" type="text" name="age" value="${user.age}">
    <p>
        <input type="submit" value="OK">
    </p>
</form>

</body>

<script>
    var frm = document.getElementById('main_form') || null;
    if (frm) {
        var url = window.location.href;

        var to = url.lastIndexOf('/');
        to = to == -1 ? url.length : to + 1;
        url = url.substring(0, to);

        frm.action = url;
    }
</script>
</html>