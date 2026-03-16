<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>

<meta charset="UTF-8">
<title>Пригоди одного хоббіта</title>
<style>
    body{
        background:#1e1e1e;
        color:white;
        font-family:Arial;
        display:flex;
        justify-content:center;
        align-items:center;
        height:100vh;
    }
    .menu-window{
        background:#2e2e2e;
        padding:40px;
        border-radius:10px;
        width:400px;
        text-align:center;
        box-shadow:0 0 15px black;
    }
    h2{
        margin-bottom:20px;
    }
    input{
        padding:10px;
        width:80%;
        border-radius:5px;
        border:none;
        margin-top:10px;
    }
    button{
        width:200px;
        padding:10px;
        margin-top:20px;
        border:none;
        border-radius:5px;
        background:#4CAF50;
        color:white;
        font-size:16px;
        cursor:pointer;
        transition:0.3s;
    }
    button:hover{
        background:#66bb6a;
        transform:scale(1.05);
    }
</style>
</head>
<body>
<div class="menu-window">
<h3>Вітаю, пане хоббіт!
    Ти пам'ятаєш моє ім'я? Мене звати Гендальф, а Гендальф - це Я.
    Мандрівний чарівник що втягує в пригоди всіх навкруги.
    Може бажаєте прогулятись до Самотньої гори у гості до Дракона Смауга?</h3>

<form action="start" method="post">

    Як Вас звати?:<br>
    <input type="text" name="name"/>

    <br><br>

    <button type="submit">Розпочати пригоду.</button>

</form>
</div>
</body>
</html>