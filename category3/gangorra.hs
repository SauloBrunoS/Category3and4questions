gangorra p1 c1 p2 c2 = if p1*c1 == p2*c2 then 0 else if p1*c1 > p2*c2 then -1 else 1

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    c <- readLn :: IO Int
    d <- readLn :: IO Int
    print $ gangorra a b c d