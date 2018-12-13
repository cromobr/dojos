


Nós não verificamos rolagens válidas.
Não verificaremos o número correto de rolos e quadros.
Não forneceremos pontuações para quadros intermediários.

---------------------------
Podemos resumir brevemente a pontuação para esta forma de boliche:

Cada jogo, ou "linha" de boliche, inclui dez turnos ou "quadros" para o lançador.
Em cada quadro, o lançador faz até duas tentativas para derrubar todos os pinos.
Se em duas tentativas, ele não conseguir derrubá-los todos, sua pontuação para esse quadro é o número total de pinos derrubados em suas duas tentativas.
Se em duas tentativas ele derruba todas, isso é chamado de “reserva” e sua pontuação para o quadro é dez mais o número de pinos derrubados em seu próximo lançamento (no seu próximo turno).
Se em sua primeira tentativa no quadro ele derruba todos os pinos, isso é chamado de "greve". Sua vez acabou, e sua pontuação para o quadro é dez mais o simples total dos pinos derrubados em seus próximos dois rolos.
Se ele receber uma reposição ou um strike no último (décimo) frame, o jogador consegue lançar uma ou duas bolas de bônus, respectivamente. Estes lançamentos de bônus são tomados como parte do mesmo turno. Se o bônus lançar derrubar todos os pinos, o processo não se repete: os lançamentos de bônus são usados ​​apenas para calcular a pontuação do quadro final.
A pontuação do jogo é o total de todas as pontuações do quadro.



Suggested Test Cases
(When scoring “X” indicates a strike, “/” indicates a spare, “-” indicates a miss)

X X X X X X X X X X X X (12 rolls: 12 strikes) = 10 frames * 30 points = 300
9- 9- 9- 9- 9- 9- 9- 9- 9- 9- (20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90
5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150
