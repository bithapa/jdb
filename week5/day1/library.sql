-- Write queries for given : 
-- 1) Fetch matching author_name, book_name, book_title, publication_year from tables mentioned (Exact record onlu be there).

SELECT
    au.author_name,
    bo.book_name,
    bo.book_title,
    bo.publication_year
FROM
    public.authors au
JOIN
    public.books bo ON au.author_id = bo.author_id
JOIN
    public.books_loan bl ON bo.book_id = bl.book_id
    
    
    
-----------------------------------------------------------------------------
-- 2) Fetch all author_name, book_name, book_title, publication_year from tables mentioned (if mapping not found , print those records)

SELECT
    au.author_name,
    bo.book_name,
    bo.book_title,
    bo.publication_year
FROM
    public.authors au
LEFT JOIN
    public.books bo ON au.author_id = bo.author_id
LEFT JOIN
    public.books_loan bl ON bo.book_id = bl.book_id;



-----------------------------------------------------------------------------
-- 3) Fetch student_name,book_name,author_name if book_loan_id = 4

SELECT
    bl.student_name,
    bo.book_name,
    au.author_name
FROM
    public.books_loan bl
JOIN
    public.books bo ON bl.book_id = bo.book_id
JOIN
    public.authors au ON bo.author_id = au.author_id
WHERE
    bl.loan_id = 4;
    
    
    
-----------------------------------------------------------------------------    
-- 5) Print student_name who have taken more than 1 book in book_loan

SELECT
    bl.student_name
FROM
    public.books_loan bl
GROUP BY
    bl.student_name
HAVING
    COUNT(bl.book_id) > 1;
    
    
    
-----------------------------------------------------------------------------        
-- 6) Fecth book_name who are not mapped in book_loan table.

SELECT
    bo.book_name
FROM
    public.books bo
LEFT JOIN
    public.books_loan bl ON bo.book_id = bl.book_id
WHERE
    bl.book_id IS NULL;



-----------------------------------------------------------------------------        
-- 7) Fecth all records with column book_name,book_title , author_name where book_title='Programming'
SELECT
    bo.book_name,
    bo.book_title,
    au.author_name
FROM
    public.books bo
JOIN
    public.authors au ON bo.author_id = au.author_id
WHERE
    bo.book_title = 'Programming';

