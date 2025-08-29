<script lang="ts">
	import '../app.css';
	import favicon from '$lib/assets/favicon.svg';
	
	let { children } = $props();
</script>

<svelte:head>
	<link rel="icon" href={favicon} />
	<title>Delivery</title>
</svelte:head>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  	<div class="container-fluid">
    	<a class="navbar-brand" href="/">Delivery</a>
		<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
			<li class="nav-item">
				<a class="nav-link text-white active" aria-current="page" href="/">Início</a>
			</li>
			<li class="nav-item">
				<a class="nav-link text-white" href="/cardapio">Cardápio</a>
			</li>
		</ul>
		<form class="d-flex" role="search" action="/cardapio/pesquisa" method="get">
			<input class="form-control me-2" name="pesquisa" type="search" placeholder="Pesquisar" aria-label="Pesquisar"/>
			<button class="btn btn-outline-success" type="submit">Pesquisar</button>
		</form>
	</div>
</nav>

{@render children?.()}

<footer style="width: 100%; position: fixed; bottom: 0;" class="bg-dark text-white text-center text-lg-start">
    <div class="container p-4">
        <div class="row">
	        <div class="col-lg-3 col-md-12 mb-4 mb-md-0">
            	<h5 class="text-uppercase">📜Sobre nós</h5>
        	    <p>
    	        	O melhor hambúrguer de Caxias do Sul! Venha nos visitar também!
	            </p>
          	</div>
			<div class="col-lg-1"></div>
			<div class="col-lg-3 col-md-12 mb-4 mb-md-0">
				<h5 class="text-uppercase">📞Contato</h5>
				<p>Telefone: (54) 912345-6789</p>
			</div>
			<div class="col-lg-1"></div>
          	<div class="col-lg-3 col-md-12 mb-4 mb-md-0">
            	<h5 class="text-uppercase">📍Endereço</h5>
            	<p>Rua Universidade, Nº 123, Bairro Universitário</p>
          	</div>
		</div>
	</div>
	<div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
		© 2025 Delivery. Todos os direitos reservados.
	</div>
</footer>
