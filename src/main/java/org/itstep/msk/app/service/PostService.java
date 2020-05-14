package org.itstep.msk.app.service;

import org.itstep.msk.app.entity.Post;
import org.itstep.msk.app.entity.User;

public interface PostService {
    void addPost(User user, Post post);

    void deletePost(Post post);

    void editPost(Post post, Post editedPost);
}
