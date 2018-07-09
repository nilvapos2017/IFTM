var produtoModule = angular.module('produtoModule',[]);

produtoModule.controller("produtoControl",function($scope){
	
	$scope.fornecedor = [
	{codigo: 1, nome: 'Alpargatas'},
	{codigo: 2, nome: 'Sadia'},
	{codigo: 3, nome: 'Nestlé'}
    ];
	
	$scope.produtos = [
	{codigo: 1, nome: 'Sandalia Havaiana', fornecedor: {codigo: 1, nome: 'Alpargatas'}},
	{codigo: 2, nome: 'Bombom Nestlé', fornecedor: {codigo: 3, nome: 'Nestlé'}},
	{codigo: 3, nome: 'Nestlé'}
    ];	
	
	$scope.selecionaProduto = function(produto){
		$scope.produto = produto;
		alert ($scope.produto.fornecedor.nome);
	}
	$scope.salvar = function() {
		$scope.produtos.push ($scope.produto);
		$scope.novo();
	}
	
	$scope.excluir = function() {
		$scope.produtos.splice($scope.produtos.indexOf($scope.produto),1);
		$scope.novo();
	}
	
	$scope.novo = function() {
		$scope.produto = "";
	}
});