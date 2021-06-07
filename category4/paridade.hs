paridade xs = odd $ foldl (\acc x -> if x then acc + 1 else acc ) 0 xs

main = do
    a <- readLn :: IO [Bool]
    print $ paridade a 


