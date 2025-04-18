CREATE TABLE cliente (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  email varchar(50) NOT NULL,
  telefone varchar(20) NOT NULL,
  cpf varchar(14) NOT NULL,
  ativo tinyint(1) NOT NULL,
  logradouro varchar(100) NOT NULL,
  numero varchar(10) NOT NULL,
  complemento varchar(10),
  bairro varchar(50) NOT NULL,
  cidade varchar(50) NOT NULL,
  estado varchar(2) NOT NULL,
  cep varchar(12) NOT NULL,
  
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (nome, email, telefone, cpf, logradouro, numero, complemento, bairro, cidade, estado, cep, ativo)
VALUES ("Maria Silva", "maria@ifsp.edu.br", "(11) 99999-9999", "123.456.789-00" , "Rua Atilio Piffer", "523", "51", "Casa Verde", "São Paulo", "SP", "02516-000", 1),
       ("João Souza", "joao@ifsp.edu.br", "(11) 98888-8888", "987.654.321-00", "Av. Dr. José Olegário de Barros", "1435", "14H", "Vila São Geraldo", "Taubaté", "SP", "12060-400",   1);
