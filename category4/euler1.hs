euler1 n = sum [y | y <- [1..(n-1)], y `mod` 3 == 0 || y `mod` 5 == 0]

main = do 

    a <- readLn :: IO Int 
    print $ euler1 a