-- From tables in earlier assignment authors,books,book_loan. Write SQL queries for given : 

-- 1) Retrieve the names of books and their authors that were published before the year 2000.
SELECT
    bo.book_name,
    au.author_name
FROM
    public.books bo
JOIN
    public.authors au ON bo.author_id = au.author_id
WHERE
    bo.publication_year < 2000;


---------------------------------------------------------
-- 2) Count the number of books written by each author.

SELECT
    au.author_name,
    COUNT(bo.book_id) AS number_of_books
FROM
    public.authors au
JOIN
    public.books bo ON au.author_id = bo.author_id
GROUP BY
    au.author_name;

---------------------------------------------------------
-- 3) Identify authors who have written more than one book.
SELECT
    au.author_name,
    COUNT(bo.book_id) AS number_of_books
FROM
    public.authors au
JOIN
    public.books bo ON au.author_id = bo.author_id
GROUP BY
    au.author_name
HAVING
    COUNT(bo.book_id) > 1;