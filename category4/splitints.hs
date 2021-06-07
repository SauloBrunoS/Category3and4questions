-- splitints xs = ([x | x <- xs, odd x], [y | y <- xs, even y])

splitints xs = (filter odd xs, filter even xs)

main = do
    a <- readLn :: IO [Int]
    print $ splitints a