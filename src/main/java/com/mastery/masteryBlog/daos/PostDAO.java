/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mastery.masteryBlog.daos;

import com.mastery.masteryBlog.dtos.Post;
import java.util.List;

/**
 *
 * @author corey
 */
public interface PostDAO {
    
    Post addPost(Post post);
    Post getPostById(int postId);
    List<Post> getAllPosts();
    void updatePost(Post post);
    void deletePost(int postId);
    List<Post> getPostsByCatagoryId(int catagoryId);
    List<Post> getPostsByTagName(String tagName);
    List<Post> getPostsByUserName(String username);
    List<Post> getPostsByDisplayId(int displayId);
    void updatePending(Post post);
    void addImage(String imagePath, int id);
    List<Post> getAllStaticPost();
    
}
