CREATE TABLE `ordemservico` (
  `codigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `data_emissao` Date NOT NULL,
  `data_finalizacao` Date,
  `valor` decimal,
  `observacao` varchar(50),
  `cliente_id` bigint(20) NOT NULL,
  `formapagamento_id` bigint(20) NOT NULL,
  
  PRIMARY KEY (`codigo`),
  FOREIGN KEY (`cliente_id`) References cliente(id),
  FOREIGN KEY (`formapagamento_id`) References formapagamento(codigo)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO ordemservico (cliente_id, descricao, data_emissao, formapagamento_id) 
	values (1, 'Formatar Computador', '2025/05/08', 2);
INSERT INTO ordemservico (cliente_id, descricao, data_emissao, formapagamento_id) 
	values (2, 'Trocar placa de video', '2025/05/08', 1);
