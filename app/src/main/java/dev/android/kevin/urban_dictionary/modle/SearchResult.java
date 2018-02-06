package dev.android.kevin.urban_dictionary.modle;

import java.util.List;

/**
 * Created by kevinsun on 2/5/18.
 */

public class SearchResult {


    private List<String> tags;

    private String result_type;

    private List<SearchDetail> list;


    private List<String> sounds;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getResult_type() {
        return result_type;
    }

    public void setResult_type(String result_type) {
        this.result_type = result_type;
    }

    public List<SearchDetail> getList() {
        return list;
    }

    public void setList(List<SearchDetail> list) {
        this.list = list;
    }

    public List<String> getSounds() {
        return sounds;
    }

    public void setSounds(List<String> sounds) {
        this.sounds = sounds;
    }

    private static class SearchDetail{
        private String definition;

        private String permalink;

        private String thumbs_up;

        private String author;

        private String word;

        private String defid;

        private String current_vote;

        private String example;

        private String thumbs_down;

        public String getDefinition() {
            return definition;
        }

        public void setDefinition(String definition) {
            this.definition = definition;
        }

        public String getPermalink() {
            return permalink;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public String getThumbs_up() {
            return thumbs_up;
        }

        public void setThumbs_up(String thumbs_up) {
            this.thumbs_up = thumbs_up;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getDefid() {
            return defid;
        }

        public void setDefid(String defid) {
            this.defid = defid;
        }

        public String getCurrent_vote() {
            return current_vote;
        }

        public void setCurrent_vote(String current_vote) {
            this.current_vote = current_vote;
        }

        public String getExample() {
            return example;
        }

        public void setExample(String example) {
            this.example = example;
        }

        public String getThumbs_down() {
            return thumbs_down;
        }

        public void setThumbs_down(String thumbs_down) {
            this.thumbs_down = thumbs_down;
        }
    }


}
