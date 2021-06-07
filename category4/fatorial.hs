{-
fatorial n 
 | n < 2 = 1
 | otherwise = n * fatorial(n-1)
-}

fatorial 0 = 1
fatorial n = product [1..n]

main = do
    a <- readLn :: IO Int
    print $ fatorial a