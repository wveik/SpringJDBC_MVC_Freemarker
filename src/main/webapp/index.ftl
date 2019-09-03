<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Тестовое приложение</title>
</head>
<body>
    <h1>Тестовое приложение</h1>

    <p>
        <a href="#" id="hello">Хелло</a>
    </p>
    <p>
        <a href="#" id="users">Пользователи</a>
    </p>
    <p>
        <a href="#" id="add_user">Создать пользователя</a>
    </p>

    <script type="text/javascript">

        document.getElementById("hello").href= window.location.href  + "hello";
        document.getElementById("users").href= window.location.href  + "users";
        document.getElementById("add_user").href= window.location.href  + "add_user";

    </script>
</body>
</html>