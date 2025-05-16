CREATE TABLE `formapagamento` (
  `codigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO formapagamento (codigo, nome) 
	values (1, 'Cartão de crédito');
INSERT INTO formapagamento (codigo, nome) 
	values (2, 'Cartão de débito');
INSERT INTO formapagamento (codigo, nome) 
	values (3, 'Pix');
