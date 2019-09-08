package com.heshicaihao.chess.game;


public interface IGameView {

    void postRepaint();

    void drawPiece(int pc, int xx, int yy);

    void drawSelected(int xx, int yy);
}
