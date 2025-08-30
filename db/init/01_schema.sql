CREATE TABLE IF NOT EXISTS ingrediente
(
    id bigserial,
    nome character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT pk_ingrediente PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS produto
(
    id bigserial,
    nome character varying(255) COLLATE pg_catalog."default" NOT NULL,
    preco numeric(10,2) NOT NULL,
    imagem character varying(255) COLLATE pg_catalog."default",
    descricao character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT pk_produto PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS produto_ingrediente
(
    id bigserial,
    produto_id bigint NOT NULL,
    ingrediente_id bigint NOT NULL,
    quantidade numeric(10,2) DEFAULT 1,
    unidade_medida character varying(20) COLLATE pg_catalog."default" DEFAULT 'UN'::character varying,
    CONSTRAINT pk_produto_ingrediente PRIMARY KEY (id),
    CONSTRAINT fk_ingrediente_id FOREIGN KEY (ingrediente_id)
            REFERENCES ingrediente (id) MATCH SIMPLE
            ON UPDATE NO ACTION
            ON DELETE CASCADE,
    CONSTRAINT fk_produto_id FOREIGN KEY (produto_id)
            REFERENCES produto (id) MATCH SIMPLE
            ON UPDATE NO ACTION
            ON DELETE CASCADE
);