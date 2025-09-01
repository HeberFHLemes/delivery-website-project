<script lang="ts">
  import CardapioLista from '$lib/components/CardapioLista.svelte';
  export let data: { produtos: Array<{ nome: string; preco: number; descricao: string; imagem: string }> };
</script>

<CardapioLista data={data} />
