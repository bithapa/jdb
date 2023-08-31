-- Exercise 3 : With already created table authors,books,book_loan .write queries to fetch data for given scenario : 
    
-- 1) Display authors along with the total number of times their books have been borrowed.
SELECT
    au.author_name,
    COUNT(bl.loan_id) AS total_borrow_count
FROM
    public.authors au
JOIN
    public.books bo ON au.author_id = bo.author_id
LEFT JOIN
    public.books_loan bl ON bo.book_id = bl.book_id
GROUP BY
    au.author_name;

---------------------------------------------------------------------------------
-- 2) List authors who haven't written any books in the database.
SELECT
    au.author_name
FROM
    public.authors au
LEFT JOIN
    public.books bo ON au.author_id = bo.author_id
WHERE
    bo.book_id IS NULL;

-- 3) List the books borrowed by a specific student . (any student name here ,that is present in db)
SELECT
    bl.student_name,
    bo.book_name,
    bo.book_title,
    au.author_name
FROM
    public.books_loan bl
JOIN
    public.books bo ON bl.book_id = bo.book_id
JOIN
    public.authors au ON bo.author_id = au.author_id
WHERE
    bl.student_name = 'Aseem';
