public class Post {


    private String id_post;
    private String txt_post;

    public Post(String id_post, String txt_post) {
        super();
        this.id_post = id_post;
        this.txt_post = txt_post;
    }

    public Post(String txt_post) {
        this.txt_post = txt_post;
    }


    public String getId_post() {
        return id_post;
    }

    public void setId_post(String id_post) {
        this.id_post = id_post;
    }

    public String getTxt_post() {
        return txt_post;
    }

    public void setTxt_post(String txt_post) {
        this.txt_post = txt_post;
    }

}
