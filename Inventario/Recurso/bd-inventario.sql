CREATE DATABASE bd-inventario;
use bd-inventario;

CREATE TABLE tb_categoria(
	id_categoria int(5) AUTO_INCREMENT PRIMARY KEY,
           nom_categoria varchar(50) NOT NULL,
           estado_categoria tinyint(1) NOT NULL)
           ENGINE = INNODB
           DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci;
                         
CREATE TABLE tb_producto(
	id_producto int(9) PRIMARY KEY AUTO_INCREMENT,
	nom_producto varchar(50) NOT NULL,
	stock decimal(3,2),
	precio decimal(3,2),
	unidad_de_medida varchar(20),
	estado_producto tinyint(1),
	categoria int(5),
	FOREIGN KEY (categoria) REFERENCES tb_categoria(id_categoria) ON UPDATE CASCADE ON DELETE CASCADE)
	ENGINE INNODB
	DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci;                        

