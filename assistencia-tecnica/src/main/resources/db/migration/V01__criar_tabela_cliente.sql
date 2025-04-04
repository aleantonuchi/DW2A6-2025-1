CREATE TABLE cliente (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  email varchar(50) NOT NULL,
  telefone varchar(20) NOT NULL,
  cpf varchar(14) NOT NULL,
  ativo tinyint(1) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (nome, email, telefone, cpf, ativo)
VALUES ('Maria Silva', 'maria@ifsp.edu.br', '(11) 99999-9999', '123.456.789-00', 1),
       ('João Souza', 'joao@ifsp.edu.br', '(11) 98888-8888', '987.654.321-00', 1);
