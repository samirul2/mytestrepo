checkAge age |age < 18  = putStrLn "Hello, Young One!"
             |age < 60  = putStrLn "Hello, Adult!"
             |otherwise = putStrLn "Hello, Pensioner!"

