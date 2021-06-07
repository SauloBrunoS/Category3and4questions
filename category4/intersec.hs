
intersec xs ys = [x | x <- xs, x `elem` xs, x `elem` ys]
main = do
    a <- readLn :: IO [Int]
    b <- readLn :: IO [Int]
    print $ intersec a b

