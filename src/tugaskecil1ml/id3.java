/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaskecil1ml;

import javax.swing.tree.DefaultMutableTreeNode;
import weka.classifiers.AbstractClassifier;
import weka.core.Instances;
/**
 *
 * @author User
 */
public class id3 extends AbstractClassifier {
    DefaultMutableTreeNode decisionTree = null;
    
    @Override
    public void buildClassifier(Instances dataset) throws Exception {
        //Check if only one class target
        dataset.deleteWithMissingClass();
    }
    
    public DefaultMutableTreeNode buildTree(Instances dataset) {
        if (dataset.numClasses() == 1) {
            decisionTree = new DefaultMutableTreeNode(dataset.get(0).classValue());
        }  
         return decisionTree;
    }    
    
}
