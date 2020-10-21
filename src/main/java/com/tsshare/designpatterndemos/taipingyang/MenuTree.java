package com.tsshare.designpatterndemos.taipingyang;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhenfei
 * @title: MenuTree
 * @projectName design-pattern-demos
 * @description: TODO
 * @date 2020/10/2121:58
 */
public class MenuTree {
    private List<Menu> menuList;

    public MenuTree(List<Menu> menuList) {
        this.menuList = menuList;
    }

    // 建立树
    public List<Menu> genMenuTree() {
        List<Menu> rootMenus =new ArrayList<>();
        for (Menu m : getNodeList()) {
            rootMenus.add(buildNodeTree(m));
        }
        return rootMenus;
    }

    //构建子树
    private Menu buildNodeTree(Menu m) {
        for (Menu s :menuList) {
            if(m.getId()== s.getPid()){
                m.getChildList().add(buildNodeTree(s));
            }
        }
        return m;
    }

    private List<Menu> getNodeList() {
        List<Menu> menus =new ArrayList<>();
        for (Menu s :menuList) {
            if(s.getPid()==0){
                menus.add(s);
            }
        }
        return menus;
    }


    class Menu {
        private int id;
        private int pid;
        private String content;
        private List<Menu> childList;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<Menu> getChildList() {
            return childList;
        }

        public void setChildList(List<Menu> childList) {
            this.childList = childList;
        }
    }
}
