<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>�������� ����������</title>
</head>
<body>
    <h1>�������� ����������</h1>

    <p>
        <a href="#" id="hello">�����</a>
    </p>
    <p>
        <a href="#" id="users">������������</a>
    </p>
    <p>
        <a href="#" id="add_user">������� ������������</a>
    </p>

    <script type="text/javascript">

        document.getElementById("hello").href= window.location.href  + "hello";
        document.getElementById("users").href= window.location.href  + "users";
        document.getElementById("add_user").href= window.location.href  + "add_user";

    </script>
</body>
</html>