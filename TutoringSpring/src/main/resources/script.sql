-- Table: public.padrone

-- DROP TABLE public.padrone;

CREATE TABLE IF NOT EXISTS public.ruolo
(
    ruoli character varying(50) COLLATE public."default" NOT NULL,
    ruolo character varying(50) COLLATE public."default" NOT NULL
)

TABLESPACE pg_default;