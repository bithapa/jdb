--1. Create the Authors table with fields :
--       author_id,author_name,author_code
----------------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS public."Authors"
(
    author_id bigint NOT NULL,
    author_name character varying COLLATE pg_catalog."default" NOT NULL,
    author_code character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Authors_pkey" PRIMARY KEY (author_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Authors"
    OWNER to postgres;
----------------------------------------------------------------------------------------
--2. Create the Books table, referencing the Authors table with a foreign key:
--       book_id,book_name,title,author_id,publication_year
----------------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS public."Books"
(
    book_id bigint NOT NULL,
    book_title character varying COLLATE pg_catalog."default" NOT NULL,
    publication_year character varying COLLATE pg_catalog."default" NOT NULL,
    author_id bigint NOT NULL,
    CONSTRAINT "Books_pkey" PRIMARY KEY (book_id),
    CONSTRAINT author_id FOREIGN KEY (author_id)
        REFERENCES public."Authors" (author_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Books"
    OWNER to postgres;
----------------------------------------------------------------------------------------
--3. Create the BookLoans table, referencing both Books and Authors tables with foreign keys:
--         lon_id,student_name,loan_date,due_date,book_id,author_id
----------------------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS public."BookLoans"
(
    loan_id bigint NOT NULL,
    student_name character varying COLLATE pg_catalog."default" NOT NULL,
    loan_date character varying COLLATE pg_catalog."default" NOT NULL,
    due_date character varying COLLATE pg_catalog."default" NOT NULL,
    book_id bigint NOT NULL,
    author_id bigint NOT NULL,
    CONSTRAINT "BookLoans_pkey" PRIMARY KEY (loan_id),
    CONSTRAINT author_id FOREIGN KEY (author_id)
        REFERENCES public."Authors" (author_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT book_id FOREIGN KEY (book_id)
        REFERENCES public."Books" (book_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."BookLoans"
    OWNER to postgres;
----------------------------------------------------------------------------------------
--4. Insert at least 10 records in each table.
----------------------------------------------------------------------------------------
--write query to :
--1) Fetch all author details.
----------------------------------------------------------------------------------------
select * from public."Authors"
----------------------------------------------------------------------------------------
--2) Fetch authors having name start with "A", "N"
----------------------------------------------------------------------------------------
--3) Fetch book_name,title,publication from Books table
--4) Fetch books with publication year between 1993 to 2023 (Insert record in Book table 1969,1946, like that)
--5) Fetch all Books with author_id 1
----------------------------------------------------------------------------------------
--6) Fetch all Book Loans fields
--7) Fetch all BookLoans that have same loan date.

