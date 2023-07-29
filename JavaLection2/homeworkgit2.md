1. Просмотрите историю коммитов в своём проекте и выберите три случайных коммита. Просмотрите изменения, которые были в них сделаны.
```
git log
git diff 8c5ed3 3258ac2 (первым более поздний коммит)

на экран выведутся измения между двумя коммитами
```
1. Просмотрите историю коммитов в своём проекте и выберите три случайных коммита. Просмотрите изменения, которые были в них сделаны.
```
git log
git diff 8c5ed3 3258ac2 (первым более ранний коммит)

на экран выведутся измения между двумя коммитами
```
2. Верните эти изменения командой git revert последовательно, чтобы в итоге получилось тоже три коммита.
```
список коммитов кратко 

 git log --oneline --all

0e6e15e (HEAD -> master) удалил  файл test2.md
d11fe8a отредактировал  файл test2.md
5520533 Создал файл test2.md
dbf2697 удалил  файл test.md
5ea3aee отредактировал  файл test.md
50b6d25 Создал файл test.md
6cc8884 (main) modifit 3
f241060 modifit gitignore2
8c5ed3e created file homeworkgi2
f84db3c modifit gitignore
229c633 created file homeworkgi2
a41e0a0 (origin/main) commit 2
3258ac2 (JAVA/master) git init
```
Возвращаем эти изменения командой git revert последовательно

```
git revert 0e6e15e
git commit -m "отменил коммит 0e6e15e"

git revert d11fe8a
git add .
git commit -m "отменил коммит d11fe8a"

git revert 5520533
git add .
git commit -m "отменил коммит d11fe8a"
```

3. Попробуйте отменить эти три коммита:
* последний — командами git reset --soft и git restore;
```
git reset --soft
git restore :/
```

* предпоследний — командой git reset --mixed и git restore;
```
git reset d11fe8a --mixed
git restore :/
```

* первый — командой git reset --hard.
```
git reset 50b6d25 --hard
HEAD is now at 50b6d25 Создал файл test.md
```


