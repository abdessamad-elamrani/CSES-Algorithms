# my Bash solution to https://cses.fi/problemset/result/1252869/

read n
echo -n $n
while [ $n -ne 1 ]
        do
        echo -n ' '
        if [ $((n%2)) -eq 0 ] ## attention the space important after the first braquet, and before last braquet
        then
                n=$((n/2))
                echo -n $n
        else
                n=$((n*3+1))
                echo -n $n
        fi
        done
