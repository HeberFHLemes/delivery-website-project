export async function load() {
  const res = await fetch('http://localhost:8080/api/cardapio');
  if (!res.ok) {
    throw new Error('Ocorreu um erro ao buscar cardápio...');
  }
  const produtos = await res.json();
  return { produtos };
}