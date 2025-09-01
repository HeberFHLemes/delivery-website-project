import { redirect } from '@sveltejs/kit';

export async function load({ url, fetch }) {
  const pesquisa = url.searchParams.get('pesquisa');
  if (!pesquisa) throw redirect(302, '/cardapio');

  const res = await fetch(`http://localhost:8080/api/cardapio/pesquisa?pesquisa=${encodeURIComponent(pesquisa)}`);
  const produtos = await res.json();
  return { produtos };
}
