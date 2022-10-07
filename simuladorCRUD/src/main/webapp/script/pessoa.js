function excluirPessoas(cd_pessoa) {
	let r = confirm("Voce deseja excluir essa aula?");
	if (r === true) {
		window.location.href = "removerPessoa?cd_pessoa=" + cd_pessoa
	}
}

function editarPessoas(cd_pessoa) {
	window.location.href = "alterarPessoa?cd_pessoa=" + cd_pessoa
}
