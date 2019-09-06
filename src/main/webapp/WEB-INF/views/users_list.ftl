<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>Users list</h1>
    <table border="1px">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
        </tr>
        <#list users as user>
            <tr>
                <td><a href="#" class="id_user" attr_id="${user.id}" attr_type="show">${user.id}</a></td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.age}</td>

                <td><a href="#" class="id_user" attr_id="${user.id}" attr_type="delete">Delete</a></td>
                <td><a href="#" class="id_user"  attr_id="${user.id}" attr_type="update">Update</a></td>
            </tr>
        </#list>
    </table>

    <script type="text/javascript">

        var url = window.location.href.replace("/users", "");

        var urls = document.getElementsByClassName("id_user");

        Array.prototype.forEach.call(urls, function (item) {
            console.log(item);

            var id = item.getAttribute("attr_id");

            var type = item.getAttribute("attr_type");

            if(type === "show")
                item.href = url + "/user/" + id;

            if(type === "delete")
                item.href = url + "/delete/" + id;

            if(type === "update")
                item.href = url + "/update/" + id;
        });

    </script>
</body>
</html>