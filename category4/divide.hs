divide xs x = (take x xs, drop x xs)

-- divide xs x = splitAt x xs 

main = do 
    a <- readLn :: IO [Int]
    b <- readLn :: IO Int
    print $ divide a b

    