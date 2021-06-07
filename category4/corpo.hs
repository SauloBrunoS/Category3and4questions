corpo xs = [x | x <- xs, x /= last xs]


main = do
    a <- readLn :: IO [Int]
    print $ corpo a