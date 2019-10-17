<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> -->
<link rel="stylesheet" href="./css/bootstrap.css">
<link rel="stylesheet" href="./css/style.css">
<link rel="icon" href="./imagem/ren.ico">


    <title>Chatbot</title>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <!-- <a class="navbar-brand" href="#">Navbar</a> -->
  <img src="./imagem/ren.ico" alt="">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.html">Home </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="chatbot.html">Chatbot</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="conteudo.html">Conteúdo</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contato</a>
      </li>
    </ul>

  </div>
</nav>




<!-- inicio do conteudo -->
<div class="container">
  <h1 class="display4">Para mais informações</h1>
  <h2 class="display1">
<p class="lead">
Em caso de dúvidas, críticas ou sugestões, envie-nos uma mensagem atravéz do formulário abaixo:
</p>
</h2>
<section class="formulario">
  <form class="contato" action="" method="post">
<h2>Contato</h2>
<fieldset>
  <input type="text" placeholder="Seu nome..." required id="nome">
</fieldset>


<fieldset>
  <input type="email" placeholder="Seu email..." required id="email">
</fieldset>

<fieldset>
<textarea id="mensagem" placeholder="Sua mensagem aqui..."></textarea>
</fieldset>

<fieldset>
  <button type="submit" id="enviar-dados">Enviar</button>
</fieldset>



  </form>
</section>

<h2 class="display4">
<p class="lead">
<strong>Ou entre em contato pelo nosso Email: grupo10fiap@gmail.com

</strong>
</p>
</h2>


</div>
</body>
</html>