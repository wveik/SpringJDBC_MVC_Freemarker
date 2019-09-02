<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>I'm a first template</h1>

<a href="#" id="main">Главная</a>

<script type="text/javascript">

    document.getElementById("main").href= window.location.href.replace("/hello", "");

</script>
</body>
</html>