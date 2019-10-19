# zoo

- Import into your IDE
- Run `Main`

Output:

```
Dog   	{name='Dog one', favoriteFood='Meat', dogType=Hunting, friends={}}
Dog   	{name='Dog two', favoriteFood='Fresh meat', dogType=Assistance, friends={}}
Dog   	{name='Dog three', favoriteFood='Pedigree', dogType=Racing, friends={}}
Parrot	{name='Parrot one', favoriteFood='Grain', canSpeak=false, wingspan=0.25, friends={}}
Parrot	{name='Parrot two', favoriteFood='Corn', canSpeak=true, wingspan=0.5, friends={}}
Chicken	{name='Chicken one', favoriteFood='Corn', isBroiler=true, wingspan=0.75, friends={}}
Chicken	{name='Chicken two', favoriteFood='Corn', isBroiler=false, wingspan=0.75, friends={}}

-------------- 1 -----------------
Dog one has established friendship with Dog three
Dog three has established friendship with Dog one
Dog two has established friendship with Parrot one
Parrot one has established friendship with Dog two
Parrot two has established friendship with Dog three
Dog three has established friendship with Parrot two
Chicken one has established friendship with Dog two
Dog two has established friendship with Chicken one

Dog   	{name='Dog one', favoriteFood='Meat', dogType=Hunting, friends={Dog three}}
Dog   	{name='Dog two', favoriteFood='Fresh meat', dogType=Assistance, friends={Parrot one, Chicken one}}
Dog   	{name='Dog three', favoriteFood='Pedigree', dogType=Racing, friends={Parrot two, Dog one}}
Parrot	{name='Parrot one', favoriteFood='Grain', canSpeak=false, wingspan=0.25, friends={Dog two}}
Parrot	{name='Parrot two', favoriteFood='Corn', canSpeak=true, wingspan=0.5, friends={Dog three}}
Chicken	{name='Chicken one', favoriteFood='Corn', isBroiler=true, wingspan=0.75, friends={Dog two}}
Chicken	{name='Chicken two', favoriteFood='Corn', isBroiler=false, wingspan=0.75, friends={}}

-------------- 2 -----------------
Dog one has established friendship with Chicken one
Chicken one has established friendship with Dog one
Dog two has established friendship with Dog one
Dog one has established friendship with Dog two
Dog two has lost friendship with Parrot one
Parrot one has lost friendship with Dog two
Dog three has established friendship with Chicken two
Chicken two has established friendship with Dog three
Parrot two has established friendship with Dog two
Dog two has established friendship with Parrot two
Chicken one has established friendship with Parrot two
Parrot two has established friendship with Chicken one
Chicken two has established friendship with Parrot one
Parrot one has established friendship with Chicken two

Dog   	{name='Dog one', favoriteFood='Meat', dogType=Hunting, friends={Chicken one, Dog three, Dog two}}
Dog   	{name='Dog two', favoriteFood='Fresh meat', dogType=Assistance, friends={Chicken one, Parrot two, Dog one}}
Dog   	{name='Dog three', favoriteFood='Pedigree', dogType=Racing, friends={Chicken two, Parrot two, Dog one}}
Parrot	{name='Parrot one', favoriteFood='Grain', canSpeak=false, wingspan=0.25, friends={Chicken two}}
Parrot	{name='Parrot two', favoriteFood='Corn', canSpeak=true, wingspan=0.5, friends={Chicken one, Dog three, Dog two}}
Chicken	{name='Chicken one', favoriteFood='Corn', isBroiler=true, wingspan=0.75, friends={Dog two, Parrot two, Dog one}}
Chicken	{name='Chicken two', favoriteFood='Corn', isBroiler=false, wingspan=0.75, friends={Parrot one, Dog three}}

-------------- 3 -----------------
Dog two has lost friendship with Parrot two
Parrot two has lost friendship with Dog two
Dog three has established friendship with Dog two
Dog two has established friendship with Dog three
Dog three has lost friendship with Parrot two
Parrot two has lost friendship with Dog three
Parrot one has lost friendship with Chicken two
Chicken two has lost friendship with Parrot one
Parrot two has established friendship with Parrot one
Parrot one has established friendship with Parrot two
Chicken one has established friendship with Parrot one
Parrot one has established friendship with Chicken one

Dog   	{name='Dog one', favoriteFood='Meat', dogType=Hunting, friends={Chicken one, Dog three, Dog two}}
Dog   	{name='Dog two', favoriteFood='Fresh meat', dogType=Assistance, friends={Chicken one, Dog three, Dog one}}
Dog   	{name='Dog three', favoriteFood='Pedigree', dogType=Racing, friends={Chicken two, Dog two, Dog one}}
Parrot	{name='Parrot one', favoriteFood='Grain', canSpeak=false, wingspan=0.25, friends={Chicken one, Parrot two}}
Parrot	{name='Parrot two', favoriteFood='Corn', canSpeak=true, wingspan=0.5, friends={Parrot one, Chicken one}}
Chicken	{name='Chicken one', favoriteFood='Corn', isBroiler=true, wingspan=0.75, friends={Parrot one, Dog two, Parrot two, Dog one}}
Chicken	{name='Chicken two', favoriteFood='Corn', isBroiler=false, wingspan=0.75, friends={Dog three}}

-------------- 4 -----------------
Dog one has established friendship with Parrot two
Parrot two has established friendship with Dog one
Dog one has lost friendship with Chicken one
Chicken one has lost friendship with Dog one
Dog two has established friendship with Parrot two
Parrot two has established friendship with Dog two
Dog two has lost friendship with Dog three
Dog three has lost friendship with Dog two
Parrot two has lost friendship with Parrot one
Parrot one has lost friendship with Parrot two
Chicken one has established friendship with Dog three
Dog three has established friendship with Chicken one
Chicken one has lost friendship with Dog two
Dog two has lost friendship with Chicken one
Chicken two has lost friendship with Dog three
Dog three has lost friendship with Chicken two

Dog   	{name='Dog one', favoriteFood='Meat', dogType=Hunting, friends={Dog three, Dog two, Parrot two}}
Dog   	{name='Dog two', favoriteFood='Fresh meat', dogType=Assistance, friends={Parrot two, Dog one}}
Dog   	{name='Dog three', favoriteFood='Pedigree', dogType=Racing, friends={Chicken one, Dog one}}
Parrot	{name='Parrot one', favoriteFood='Grain', canSpeak=false, wingspan=0.25, friends={Chicken one}}
Parrot	{name='Parrot two', favoriteFood='Corn', canSpeak=true, wingspan=0.5, friends={Chicken one, Dog two, Dog one}}
Chicken	{name='Chicken one', favoriteFood='Corn', isBroiler=true, wingspan=0.75, friends={Parrot one, Dog three, Parrot two}}
Chicken	{name='Chicken two', favoriteFood='Corn', isBroiler=false, wingspan=0.75, friends={}}

-------------- 5 -----------------
Dog one has established friendship with Chicken two
Chicken two has established friendship with Dog one
Dog one has lost friendship with Dog three
Dog three has lost friendship with Dog one
Dog two has established friendship with Parrot one
Parrot one has established friendship with Dog two
Dog two has lost friendship with Dog one
Dog one has lost friendship with Dog two
Parrot one has established friendship with Dog three
Dog three has established friendship with Parrot one
Parrot one has lost friendship with Chicken one
Chicken one has lost friendship with Parrot one
Parrot two has established friendship with Parrot one
Parrot one has established friendship with Parrot two

Dog   	{name='Dog one', favoriteFood='Meat', dogType=Hunting, friends={Chicken two, Parrot two}}
Dog   	{name='Dog two', favoriteFood='Fresh meat', dogType=Assistance, friends={Parrot one, Parrot two}}
Dog   	{name='Dog three', favoriteFood='Pedigree', dogType=Racing, friends={Parrot one, Chicken one}}
Parrot	{name='Parrot one', favoriteFood='Grain', canSpeak=false, wingspan=0.25, friends={Dog three, Dog two, Parrot two}}
Parrot	{name='Parrot two', favoriteFood='Corn', canSpeak=true, wingspan=0.5, friends={Parrot one, Chicken one, Dog two, Dog one}}
Chicken	{name='Chicken one', favoriteFood='Corn', isBroiler=true, wingspan=0.75, friends={Dog three, Parrot two}}
Chicken	{name='Chicken two', favoriteFood='Corn', isBroiler=false, wingspan=0.75, friends={Dog one}}

```
