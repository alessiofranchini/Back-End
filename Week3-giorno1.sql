CREATE TABLE clienti(
    NumeroCliente SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	cognome VARCHAR NOT NULL,
	DataNascita int NOT NULL,
	regioneREsidenza VARCHAR NOT NULL
);

INSERT INTO clienti(nome,Cognome,DataNascita,regioneResidenza) VALUES('Alessio','Rossi',1999,'Roma');
INSERT INTO clienti(nome,Cognome,DataNascita,regioneResidenza) VALUES('Luca','Neri',1998,'Latina');

SELECT * FROM clienti;

DROP TABLE fatture;

CREATE TABLE fatture(
	numerofattura SERIAL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importo float NOT NULL,
	iva int NOT NULL, 
	idCliente int NOT NULL,
	dataDiFattura int NOT NULL,
	numeroFornitore int NOT NULL UNIQUE,
	CONSTRAINT fk_Cliente FOREIGN KEY(idCliente) REFERENCES clienti(NumeroCliente)
);

INSERT INTO fatture(tipologia,importo,iva,idCliente,dataDiFattura,numeroFornitore) VALUES('frutta',20.4,20,1,1902,3);
INSERT INTO fatture(tipologia,importo,iva,idCliente,dataDiFattura,numeroFornitore) VALUES('pc',800,20,2,2013,6);

CREATE TABLE prodotti(
	idProdotto SERIAL PRIMARY KEY,
	descrizione VARCHAR NOT NULL,
	inProduzione boolean NOT NULL,
	inCommercio boolean NOT NULL,
	dataAttivazione int NOT NULL,
	dataDisattivazione int NOT NULL
);

CREATE TABLE fornitori(
	numeroFornitori SERIAL PRIMARY KEY,
	Denominazione VARCHAR NOT NULL,
	RegioneResidenza VARCHAR NOT NULL,
	CONSTRAINT fk_fornitore FOREIGN KEY(numeroFornitori) REFERENCES fatture(numeroFornitore)
);