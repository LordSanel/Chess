package Board.Pieces;

public enum PieceTypes {
    WHITE_PAWN("♙"),
    BLACK_PAWN("♟"),
    WHITE_KNIGHT("♘"),
    BLACK_KNIGHT("♞"),
    WHITE_ROOK("♖"),
    BLACK_ROOK("♜"),
    WHITE_BISHOP("♗"),
    BLACK_BISHOP("♝"),
    WHITE_KING("♔"),
    BLACK_KING("♚"),
    WHITE_QUEEN("♕"),
    BLACK_QUEEN("♛");

    private final String icon;

    PieceTypes(String icon){
        this.icon = icon;
    }
    public String getIcon(){
        return this.icon;
    }
}
