interior xs = take (length xs - 2) (tail xs)

main = do
    a <- readLn :: IO [Int]
    print $ interior a