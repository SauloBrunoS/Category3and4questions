
uniao xs ys = xs ++ [y | y <- ys, y `notElem` xs]

main = do
    a <- readLn :: IO [Int]
    b <- readLn :: IO [Int]
    print $ uniao a b

