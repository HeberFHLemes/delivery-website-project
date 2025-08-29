<script lang="ts">
  export let data: { produtos: Array<{ nome: string; preco: number; descricao: string; imagem: string}> };
</script>

<div id="cardapioDiv">
    <div class="row row-cols-1 row-cols-md-3 g-4">
        {#each data.produtos as produto}
        <div class="col">
            <div class="card">
                <img src={`/img/${produto.imagem}`} class="card-img-top" style="max-height: 400px; max-width: 600px" alt={produto.nome} />
                <div class="card-body">
                    <div class="row card-title">
                        <h5 class="col">{produto.nome}</h5>
                        <h5 class="col" id="precoCard">R$ {produto.preco.toFixed(2)}</h5>
                    </div>
                    <p class="card-text" >{produto.descricao}</p>
                </div>
            </div>
        </div>
        {/each}
    </div>
</div>